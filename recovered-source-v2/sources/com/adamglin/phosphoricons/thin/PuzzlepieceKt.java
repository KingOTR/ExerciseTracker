package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Puzzlepiece.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PuzzlePiece", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPuzzlePiece", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_puzzlePiece", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PuzzlepieceKt {
    private static ImageVector _puzzlePiece;

    public static final ImageVector getPuzzlePiece(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _puzzlePiece;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PuzzlePiece", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(218.14f, 161.93f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.86f, -0.24f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -34.23f, -23.25f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 34.23f, -20.13f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 220.0f, 114.7f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.horizontalLineTo(167.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -62.91f, -10.33f);
        pathBuilder.arcTo(32.57f, 32.57f, 0.0f, false, false, 105.0f, 60.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 72.0f);
        pathBuilder.verticalLineToRelative(37.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -10.33f, 62.91f);
        pathBuilder.arcTo(32.28f, 32.28f, 0.0f, false, false, 52.0f, 171.0f);
        pathBuilder.verticalLineToRelative(37.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.verticalLineTo(165.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 218.14f, 161.93f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.verticalLineTo(165.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.86f, -3.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.85f, -0.24f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -34.24f, -20.13f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 34.24f, -23.25f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 60.0f, 114.7f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(46.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.62f, -5.71f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 20.13f, -34.24f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 23.25f, 34.24f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 161.31f, 68.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(37.0f);
        pathBuilder.arcToRelative(32.57f, 32.57f, 0.0f, false, false, -10.33f, -0.94f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, true, false, 212.0f, 171.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _puzzlePiece = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
