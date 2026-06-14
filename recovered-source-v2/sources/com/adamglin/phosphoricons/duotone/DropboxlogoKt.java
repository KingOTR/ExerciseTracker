package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dropboxlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropboxLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getDropboxLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropboxLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropboxlogoKt {
    private static ImageVector _dropboxLogo;

    public static final ImageVector getDropboxLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _dropboxLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DropboxLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 84.0f);
        pathBuilder.lineTo(76.0f, 120.0f);
        pathBuilder.lineTo(24.0f, 84.0f);
        pathBuilder.lineTo(76.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 84.0f);
        pathBuilder.lineTo(180.0f, 48.0f);
        pathBuilder.lineTo(128.0f, 84.0f);
        pathBuilder.lineToRelative(52.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(24.0f, 156.0f);
        pathBuilder.lineToRelative(52.0f, 36.0f);
        pathBuilder.lineToRelative(52.0f, -36.0f);
        pathBuilder.lineTo(76.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 156.0f);
        pathBuilder.lineTo(180.0f, 192.0f);
        pathBuilder.lineTo(232.0f, 156.0f);
        pathBuilder.lineTo(180.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(236.55f, 149.42f);
        pathBuilder2.lineTo(194.05f, 120.0f);
        pathBuilder2.lineToRelative(42.5f, -29.42f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.16f);
        pathBuilder2.lineToRelative(-52.0f, -36.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.1f, 0.0f);
        pathBuilder2.lineTo(128.0f, 74.27f);
        pathBuilder2.lineTo(80.55f, 41.42f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.1f, 0.0f);
        pathBuilder2.lineToRelative(-52.0f, 36.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 13.16f);
        pathBuilder2.lineTo(62.0f, 120.0f);
        pathBuilder2.lineToRelative(-42.5f, 29.42f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 13.16f);
        pathBuilder2.lineToRelative(52.0f, 36.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.1f, 0.0f);
        pathBuilder2.lineTo(128.0f, 165.73f);
        pathBuilder2.lineToRelative(47.45f, 32.85f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.1f, 0.0f);
        pathBuilder2.lineToRelative(52.0f, -36.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.16f);
        pathBuilder2.close();
        pathBuilder2.moveTo(180.0f, 57.73f);
        pathBuilder2.lineTo(218.0f, 84.0f);
        pathBuilder2.lineTo(180.0f, 110.27f);
        pathBuilder2.lineTo(142.05f, 84.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(38.05f, 84.0f);
        pathBuilder2.lineTo(76.0f, 57.73f);
        pathBuilder2.lineTo(114.0f, 84.0f);
        pathBuilder2.lineTo(76.0f, 110.27f);
        pathBuilder2.close();
        pathBuilder2.moveTo(76.05f, 182.27f);
        pathBuilder2.lineTo(38.05f, 156.0f);
        pathBuilder2.lineToRelative(38.0f, -26.27f);
        pathBuilder2.lineTo(114.0f, 156.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(90.05f, 120.0f);
        pathBuilder2.lineTo(128.05f, 93.73f);
        pathBuilder2.lineTo(166.0f, 120.0f);
        pathBuilder2.lineTo(128.0f, 146.27f);
        pathBuilder2.close();
        pathBuilder2.moveTo(180.05f, 182.27f);
        pathBuilder2.lineTo(142.05f, 156.0f);
        pathBuilder2.lineTo(180.0f, 129.73f);
        pathBuilder2.lineTo(218.0f, 156.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(158.52f, 206.91f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.0f, 11.13f);
        pathBuilder2.lineToRelative(-23.89f, 16.54f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.1f, 0.0f);
        pathBuilder2.lineTo(99.56f, 218.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.1f, -13.16f);
        pathBuilder2.lineTo(128.0f, 218.27f);
        pathBuilder2.lineToRelative(19.34f, -13.39f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 158.47f, 206.91f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropboxLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
