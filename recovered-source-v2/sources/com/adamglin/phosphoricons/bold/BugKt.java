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

/* compiled from: Bug.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bug", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBug", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bug", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BugKt {
    private static ImageVector _bug;

    public static final ImageVector getBug(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _bug;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bug", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(140.0f, 88.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 140.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 72.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 100.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 144.0f);
        pathBuilder.arcToRelative(91.84f, 91.84f, 0.0f, false, true, -2.34f, 20.64f);
        pathBuilder.lineTo(236.81f, 173.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.62f, 22.0f);
        pathBuilder.lineToRelative(-18.0f, -7.85f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, -162.46f, 0.0f);
        pathBuilder.lineToRelative(-18.0f, 7.85f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -9.62f, -22.0f);
        pathBuilder.lineToRelative(19.15f, -8.36f);
        pathBuilder.arcTo(91.84f, 91.84f, 0.0f, false, true, 36.0f, 144.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.lineTo(16.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.lineTo(36.0f, 116.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.arcToRelative(91.84f, 91.84f, 0.0f, false, true, 2.34f, -20.64f);
        pathBuilder.lineTo(19.19f, 83.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.62f, -22.0f);
        pathBuilder.lineToRelative(18.0f, 7.85f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, 162.46f, 0.0f);
        pathBuilder.lineToRelative(18.0f, -7.85f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 9.62f, 22.0f);
        pathBuilder.lineToRelative(-19.15f, 8.36f);
        pathBuilder.arcTo(91.84f, 91.84f, 0.0f, false, true, 220.0f, 112.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.lineTo(220.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 116.0f);
        pathBuilder.lineTo(196.0f, 116.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, -136.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 210.92f);
        pathBuilder.lineTo(116.0f, 140.0f);
        pathBuilder.lineTo(60.0f, 140.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcTo(68.1f, 68.1f, 0.0f, false, false, 116.0f, 210.92f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 144.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.lineTo(140.0f, 140.0f);
        pathBuilder.verticalLineToRelative(70.92f);
        pathBuilder.arcTo(68.1f, 68.1f, 0.0f, false, false, 196.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bug = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
