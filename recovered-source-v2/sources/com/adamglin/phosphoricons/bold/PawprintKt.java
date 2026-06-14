package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pawprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PawPrint", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPawPrint", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pawPrint", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PawprintKt {
    private static ImageVector _pawPrint;

    public static final ImageVector getPawPrint(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _pawPrint;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PawPrint", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.0f, 108.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 236.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 108.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 68.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 84.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 68.0f, 60.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 92.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 84.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 164.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 184.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -61.1f, 40.55f);
        pathBuilder.arcToRelative(60.15f, 60.15f, 0.0f, false, false, -45.8f, 0.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 67.0f, 145.34f);
        pathBuilder.arcTo(31.33f, 31.33f, 0.0f, false, false, 81.91f, 126.6f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 92.18f, 0.0f);
        pathBuilder.arcTo(31.34f, 31.34f, 0.0f, false, false, 189.0f, 145.34f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 212.0f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 184.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -10.49f, -17.6f);
        pathBuilder.lineToRelative(-0.1f, -0.06f);
        pathBuilder.arcToRelative(55.22f, 55.22f, 0.0f, false, true, -26.37f, -33.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -46.08f, 0.0f);
        pathBuilder.arcToRelative(55.21f, 55.21f, 0.0f, false, true, -26.37f, 33.05f);
        pathBuilder.lineToRelative(-0.1f, 0.06f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 88.0f, 204.0f);
        pathBuilder.arcToRelative(19.77f, 19.77f, 0.0f, false, false, 7.8f, -1.58f);
        pathBuilder.lineToRelative(0.13f, 0.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, true, 64.14f, 0.0f);
        pathBuilder.lineToRelative(0.13f, 0.0f);
        pathBuilder.arcTo(19.77f, 19.77f, 0.0f, false, false, 168.0f, 204.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 188.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pawPrint = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
