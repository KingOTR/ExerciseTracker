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

/* compiled from: Peace.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Peace", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPeace", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_peace", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PeaceKt {
    private static ImageVector _peace;

    public static final ImageVector getPeace(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _peace;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Peace", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 128.0f);
        pathBuilder.arcToRelative(83.43f, 83.43f, 0.0f, false, true, -9.0f, 37.84f);
        pathBuilder.lineToRelative(-63.0f, -44.09f);
        pathBuilder.lineTo(140.0f, 44.87f);
        pathBuilder.arcTo(84.12f, 84.12f, 0.0f, false, true, 212.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 44.87f);
        pathBuilder.verticalLineToRelative(76.88f);
        pathBuilder.lineTo(53.0f, 165.84f);
        pathBuilder.arcToRelative(83.93f, 83.93f, 0.0f, false, true, 63.0f, -121.0f);
        pathBuilder.close();
        pathBuilder.moveTo(66.83f, 185.48f);
        pathBuilder.lineTo(116.0f, 151.05f);
        pathBuilder.verticalLineToRelative(60.08f);
        pathBuilder.arcTo(83.86f, 83.86f, 0.0f, false, true, 66.83f, 185.48f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 211.13f);
        pathBuilder.lineTo(140.0f, 151.05f);
        pathBuilder.lineToRelative(49.17f, 34.43f);
        pathBuilder.arcTo(83.86f, 83.86f, 0.0f, false, true, 140.0f, 211.13f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _peace = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
